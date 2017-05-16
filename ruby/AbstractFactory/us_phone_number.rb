require_relative 'phonenumber'

class USPhoneNumber < PhoneNumber
  def initialize(phone_number)
    if is_valid_phonenumber(phone_number)
      phone_number = phone_number
    else
      raise 'Invalid post code'
    end

    puts "Creating a instance of USPhoneNumber #{phone_number}"
  end

  def is_valid_phonenumber(phone_number)
    (phone_number =~ /^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$/)
  end
end