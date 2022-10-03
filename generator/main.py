import argparse
import os
import re
import sys
import xml.etree.ElementTree as ET
from gentasks.generator import Generator


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
    params = tree_parser(root)
    os.makedirs('gen', exist_ok=True)
    generator = Generator()
    generator.generate(params, 'gen')

    sys.exit("Script generated")
