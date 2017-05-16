require_relative 'phone_number_factory'
require_relative 'post_code_factory'

class AbstractFactory
  def self.get_factory (type)
    if type == "Phone"
      PhoneNumberFactory.new
    elsif type == "Post"
      PostCodeFactory.new
    end
  end
end