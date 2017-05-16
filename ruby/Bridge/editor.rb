require_relative 'theme'

class Editor
  def set_theme (theme)
    @theme = theme # >> 3
    puts 'Editor : Applying theme with background color ' + @theme.background_color + ' and font color ' + @theme.color
  end
end