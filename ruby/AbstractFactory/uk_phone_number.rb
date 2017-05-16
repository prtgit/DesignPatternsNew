require_relative 'phonenumber'

class UKPhoneNumber < PhoneNumber
  def initialize(phone_number)
    if is_valid_phonenumber(phone_number)
      phone_number = phone_number
    else
      raise 'Invalid post code'
    end

    puts "Creating a instance of UKPhoneNumber #{phone_number}"
  end

  def is_valid_phonenumber(phone_number)
    (phone_number =~ /^(?:(?:\(?(?:0(?:0|11)\)?[\s-]?\(?|\+)44\)?[\s-]?(?:\(?0\)?[\s-]?)?)|(?:\(?0))(?:(?:\d{5}\)?[\s-]?\d{4,5})|(?:\d{4}\)?[\s-]?(?:\d{5}|\d{3}[\s-]?\d{3}))|(?:\d{3}\)?[\s-]?\d{3}[\s-]?\d{3,4})|(?:\d{2}\)?[\s-]?\d{4}[\s-]?\d{4}))(?:[\s-]?(?:x|ext\.?|\#)\d{3,4})?$/)
  end
end