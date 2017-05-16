class ProductionSupport
  def set_next (chain)
    @support_chain = chain
  end

  def handle_request (issue_type)
    if issue_type == "Production"
      puts "Production support team will reach to you shortly"
    else
      @support_chain.handle_request(issue_type)
    end
  end
end