class GenericSupport
  def set_next (chain)
    @support_chain = chain #> 4
  end

  def handle_request (issue_type)
    if issue_type == "General"
      puts "General support team will reach to you shortly"
    else
      @support_chain.handle_request(issue_type)
    end
  end
end