require_relative 'us_post_code'
require_relative 'uk_post_code'

class PostCodeFactory
  def get_instance(country, postcode)
    if country == "US"
      return USPostCode.new(postcode)
    elsif country == "UK"
      return UKPostCode.new(postcode)
    end

    raise 'Country is not supported'
  end
end