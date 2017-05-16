class NBCNews
  def initialize (breaking_news_feed)
    @breaking_news_feed = breaking_news_feed
    breaking_news_feed.subscribe(self)
  end

  def sendNotification
    puts 'NBC Breaking News: ' +@breaking_news_feed.breaking_news
  end
end