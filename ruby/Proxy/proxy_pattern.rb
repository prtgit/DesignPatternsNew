require_relative 'movie'
require_relative 'movie_player'

moviePlayer = MoviePlayer.new("The Prestige")
print "#{moviePlayer.getMovieDetails}"
moviePlayer.playMovie
