#this class acts as Proxy
require_relative 'video_functions'

class MoviePlayer < VideoFunctions
  attr_accessor :movie
  attr_accessor :name

  def initialize(name)
    @movie = Movie.new(name)
  end

  def playMovie
    movie.playMovie
  end

  def getMovieDetails
    movie.getMovieDetails
  end

  def deleteMovie
    puts "\nPermission denied!"
  end
end