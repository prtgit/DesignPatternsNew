require_relative 'gui_adapter'

gui = GUIAdapter.new("windows")
gui.display

gui = GUIAdapter.new("linux")
gui.display