class ConfigurationSupport
  def set_next (chain)
    @support_chain = chain
  end

  def handle_request (issue_type)
    if issue_type == "Configuration"
      puts "Configuration support team will reach to you shortly"
    else
      @support_chain.handle_request(issue_type)
    end
  end
end