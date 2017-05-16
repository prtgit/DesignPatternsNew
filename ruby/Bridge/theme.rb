class Theme
  attr_accessor :color
  attr_accessor :background_color

  def set_font_color (font_color)
      @color = font_color
  end

  def set_background_color (background_color)
    @background_color = background_color
  end
end