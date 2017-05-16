require_relative 'database'
require_relative 'csv_data'
require_relative 'tsv_data'
require_relative 'extraction'

puts 'Select one of the data types (d-Database/c-CSV/t-TSV):'
datatype = gets.chomp

case datatype
  when 'd'
    data = Database.new
  when 'c'
    data = CSVData.new
  when 't'
    data = TSVData.new
end

data.extractData
