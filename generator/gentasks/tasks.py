from abc import ABC

from multigen.jinja import JinjaTask
import os

from sklearn import model_selection


class MainTask(JinjaTask):
    template_name = 'main.py.jinja'

    def filtered_elements(self, model):
        return model

    def relative_path_for_element(self, element):
        return os.path.relpath('main.py')


class DEMVTask(JinjaTask):
    template_name = 'demv.py.jinja'

    def filtered_elements(self, model):
        return model

    def relative_path_for_element(self, element):
        return os.path.relpath('demv.py')


class BalancerTask(JinjaTask):
    template_name = 'balancers.py.jinja'

    def filtered_elements(self, model):
        return model

    def relative_path_for_element(self, element):
        return os.path.relpath('balancer.py')


class EnvironmentTask(JinjaTask):
    template_name = 'environment.yml.jinja'

    def filtered_elements(self, model):
        return model

    def relative_path_for_element(self, element):
        return os.path.relpath('environment.yml')


class ToolsTask(JinjaTask):
    template_name = 'tools.py.jinja'

    def filtered_elements(self, model):
        return model

    def relative_path_for_element(self, element):
        return os.path.relpath('tools.py')


class UtilTask(JinjaTask):
  template_name = 'utils.py.jinja'

  def filtered_elements(self, model):
      return model
  
  def relative_path_for_element(self, element):
      return os.path.relpath('utils.py')