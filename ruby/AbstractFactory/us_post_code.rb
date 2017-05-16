require_relative 'postcode'

class USPostCode < PostCode
  def initialize(post_code)
    if is_valid_postcode(post_code)
      @post_code = post_code
    else
      raise 'Invalid post code'
    end

    puts "Creating a instance of USPostCode #{post_code}"
  end

  def is_valid_postcode(post_code)
    (post_code =~ /^[0-9]{5}(?:-[0-9]{4})?$/)
  end
end