# MANILA Replication Package

This folder contains the replication package of the experimental evaluation conducted in section 5.2 of the paper.

The package is structured as follows:

- **experiment_1, experiment_2, experiment_3**: these folders contains the generated code for the three implemented experiments
- **analysis.ipynb**: this jupyter notebook contains the code used to analyze the results of the experiments and generate the charts and table reported in the table
- **data_full.csv**: this dataset contains the aggregate results of the three experiments for more convenient analysis

## Prerequisites

You should follow the instructions reported in the [README](../README.md) of the root folder to setup the MANILA framework.

## Generating the experiments code

Follow these steps to generate the experiments source code:

1. The configuration files of the experiments are stored in the `manila-fm/configs` folder and follow this naming convention: `experiment<number>_<dataset>.xml`. For example, the configuration file of the first experiment using the CMC dataset is `experiment1_cmc.xml`. They can be opened and modified using the FeatureIDE tool as explained in the [README](../README.md) of the root folder.

2. From the root MANILA folder call the generator file with the following command:

```shell
$ conda activate manila_env
$ python generator/generator.py -n manila-fm/configs/<config_file>.xml
```

where `<config_file>` is the name of the configuration file to use.

3. The generated code will be stored in the `gen` folder.

## Running the experiments

Follow these steps to run the experiments:

1. Move to the folder of the experiment you want to run:

```shell
$ cd experiment<number>_<dataset>
```

e.g., `cd cmc_experiment`

2. Create the required environment and execute the generated experiment with the following commands:

```shell
$ conda env create -f environment.yml
$ conda activate base_env
$ python main.py -d <dataset>.csv
```

where `<dataset>` is the path to the dataset to use (each dataset is stored inside its experiment folder). For instance the `cmc` dataset is stored inside the `cmc_experiment` folder.

3. The results of the experiment will be stored in the `results` folder.
