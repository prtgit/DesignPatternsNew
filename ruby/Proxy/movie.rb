# Implementation of video functions. This is implementation of real subject,
# that is objects of which are accessed through proxy
require_relative 'video_functions'

class Movie < VideoFunctions
  attr_accessor :name
  def initialize(name)
    @name = name
  end

  def playMovie
    print "Playing movie: #{@name}"
  end

  def getMovieDetails()
    details = ""
    if @name == "The Prestige"
      details = "Name: The Prestige\n Size: 1023MB\n Director: Christopher Nolan\n"
    else
      details = "Details not available.\n";
    end
    details
  end
end