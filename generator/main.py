import argparse
import os
import re
import sys
import xml.etree.ElementTree as ET
from gentasks.generator import Generator


def camel_to_snake(name):
    name = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', name)
    return re.sub('([a-z0-9])([A-Z])', r'\1_\2', name).lower().strip().replace(" ", "_")

def tree_parser(root):
    params = dict()
    for feature in root.findall('feature'):
        if feature.get('automatic') == 'selected' or feature.get('manual') == 'selected':
            for child in feature:
                params[camel_to_snake(child.get('name'))] = child.get('value')
            params[camel_to_snake(feature.get('name'))] = camel_to_snake(
                feature.get('name'))
    return params

def check_params(params):
    if 'name' not in params:
        sys.exit(
            "Label name not specified. Specify the name of the label in the configuration file")
    if 'positive_value' not in params and 'fairness' in params:
        sys.exit(
            "Positive value of the label not specified. Specify the positive value of the label in the configuration file")
    if 'single_sensitive_var' in params and 'variable_name' not in params:
        sys.exit(
            "Sensitive variable name not specified. Specify the name in the configuration file")
    if 'single_sensitive_var' in params and 'unprivileged_value' not in params:
        sys.exit(
            "Unprivileged value not specified. Specify the value in the configuration file")
    if 'multiple_sensitive_vars' in params and 'variable_names' not in params:
        sys.exit(
            "Sensitive variable names not specified. Specify the names in the configuration file (comma separated)")
    if 'multiple_sensitive_vars' in params and 'unprivileged_values' not in params:
        sys.exit(
            "Unprivileged values not specified. Specify the values in the configuration file (comma separated)")


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
    check_params(params)
    os.makedirs('gen', exist_ok=True)
    generator = Generator()
    generator.generate(params, 'gen')

    sys.exit("Script generated")
