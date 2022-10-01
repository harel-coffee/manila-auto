import argparse
import os
import xml.etree.ElementTree as ET
from jinja2 import Environment, PackageLoader, select_autoescape
import sys
import re


def camel_to_snake(name):
    name = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', name)
    return re.sub('([a-z0-9])([A-Z])', r'\1_\2', name).lower()


def tree_parser(root):
    params = dict()
    for feature in root.findall('feature'):
        if feature.get('automatic') == 'selected' or feature.get('manual') == 'selected':
            for child in feature:
                params[camel_to_snake(child.get('name'))] = child.get('value')
            params[camel_to_snake(feature.get('name'))] = camel_to_snake(
                feature.get('name'))
    return params


if __name__ == '__main__':

    parser = argparse.ArgumentParser(
        description="Generate python script from configuration file")
    parser.add_argument('-n', '--name', type=str,
                        help='name of configuration file inside configs folder')

    args = parser.parse_args()
    try:
        tree = ET.parse(args.name)
        root = tree.getroot()
    except:
        sys.exit(
            "File not found in the configs folder. Make sure you add .xml at the end of the file name")
    params = tree_parser(root)
    print(params)
    env = Environment(loader=PackageLoader('generator'),
                      autoescape=select_autoescape(disabled_extensions=('py')), lstrip_blocks=True, trim_blocks=True)
    main = env.get_template('main.py.jinja')
    utils = env.get_template('utils.py.jinja')
    balancers = env.get_template('balancers.py.jinja')
    demv = env.get_template('demv.py.jinja')
    environment = env.get_template('environment.yml.jinja')
    tools = env.get_template('tools.py.jinja')
    params = tree_parser(root)
    os.makedirs('gen', exist_ok=True)
    with open(os.path.join('gen', 'main.py'), 'w') as f:
        f.write(main.render(params))
        f.write(utils.render())
        f.write(environment.render(params))
        if 'demv' in params:
            f.write(demv.render())
        if 'blackbox' in params:
            f.write(balancers.render())
            f.write(tools.render())
    sys.exit("Script generated")
