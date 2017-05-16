require_relative 'theme'

class Terminal
  def set_theme (theme)
    @theme = theme # >> 4
    puts 'Editor : Applying theme with background color ' + @theme.background_color + ' and font color ' + @theme.color
  end
end