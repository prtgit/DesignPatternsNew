require_relative 'us_phone_number'
require_relative 'uk_phone_number'

class PhoneNumberFactory
  def get_instance(country, phone_number)
    if country == "US"
      return USPhoneNumber.new(phone_number)
    elsif country == "UK"
      return UKPhoneNumber.new(phone_number)
    end

    raise 'Country is not supported'
  end
end