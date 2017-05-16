require_relative 'theme'
class LightTheme < Theme
  def initialize
    set_background_color('#FFF')
    set_font_color('#000')
  end
end