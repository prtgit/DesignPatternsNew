require_relative 'postcode'

class UKPostCode < PostCode
  def initialize(post_code)
    if is_valid_postcode(post_code)
      @post_code = post_code
    else
      raise 'Invalid post code'
    end

    puts "Creating a instance of UKPostCode #{post_code}"
  end

  def is_valid_postcode(post_code)
    (post_code =~ /^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) [0-9][ABD-HJLNP-UW-Z]{2})/)
  end
end