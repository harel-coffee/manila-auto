from multigen.jinja import JinjaGenerator
from gentasks.tasks import *
import os
from jinja2 import select_autoescape
class Generator(JinjaGenerator):

  demvTask = DEMVTask()
  mainTask = MainTask()
  balancerTask = BalancerTask()
  envTask = EnvironmentTask()
  toolTask = ToolsTask()
  utilTask = UtilTask()

  tasks = [
    mainTask,
    demvTask,
    balancerTask,
    envTask,
    toolTask,
    utilTask
  ]

  templates_path = os.path.join(
      os.path.abspath(os.path.dirname(__file__)),
      '..',
      'templates'
  )

  def create_environment(self, **kwargs):
    return super().create_environment(
      autoescape=select_autoescape(disabled_extensions=('py')), 
      lstrip_blocks=True, trim_blocks=True)

  def generate(self, model, outfolder):
    if 'demv' not in model:
      self.tasks.pop(self.tasks.index(self.demvTask))
    if 'blackbox' not in model:
      self.tasks.pop(self.tasks.index(self.balancerTask))
      self.tasks.pop(self.tasks.index(self.toolTask))
    return super().generate(model, outfolder)