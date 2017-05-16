require_relative 'theme'
class DarkTheme < Theme
  def initialize
    set_background_color('#000')
    set_font_color('#fff')
  end
end