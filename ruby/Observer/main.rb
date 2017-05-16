require_relative 'breaking_news_feed'
require_relative 'cnn'
require_relative 'fox_news'
require_relative 'nbc_news'

breaking_news_feed = BreakingNewsFeed.new
cnn = CNN.new (breaking_news_feed)
fox = FoxNews.new (breaking_news_feed)

breaking_news_feed.set_breaking_news('UK votes to leave EU')

nbc = NBCNews.new (breaking_news_feed)
breaking_news_feed.set_breaking_news('Dow Jones set new record')
