class BreakingNewsFeed
  attr_accessor :breaking_news

  def initialize
    @observers = Array.new
  end

  def subscribe (observer)
    @observers.push(observer)
  end

  def notify_subscriber
    for observer in @observers
      observer.sendNotification # > 1
    end
  end

  def set_breaking_news (breaking_news)
    @breaking_news = breaking_news
    notify_subscriber # > 2
  end
end