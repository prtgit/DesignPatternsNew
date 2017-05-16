require_relative 'post_code_factory'

uk_post_code = PostCodeFactory.get_instance('UK', "SW15 5PU")
in_post_code = PostCodeFactory.get_instance('IN', "576222")
us_post_code = PostCodeFactory.get_instance('US', "27606")
PostCodeFactory.get_instance('US', "27606-3267")
us_post_code = PostCodeFactory.get_instance('US', "2760")