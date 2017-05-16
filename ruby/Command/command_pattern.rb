require_relative 'extracting_tool'
require_relative 'db_extraction'
require_relative 'csv_extraction'
require_relative 'tsv_extraction'

extractingTool = ExtractingTool.new
extractingTool.setExtraction(CSVExtraction.new("a.csv"))
extractingTool.startExtraction

extractingTool.setExtraction(TSVExtraction.new("b.tsv"))
extractingTool.startExtraction()

extractingTool.setExtraction(DBExtraction.new("c.db"))
extractingTool.startExtraction()
