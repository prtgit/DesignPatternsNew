class FoxNews
  def initialize (breaking_news_feed)
    @breaking_news_feed = breaking_news_feed
    breaking_news_feed.subscribe(self)
  end

  def sendNotification
    puts 'Fox Alert : ' +@breaking_news_feed.breaking_news
  end
end