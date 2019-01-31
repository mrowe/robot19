#!/usr/bin/env /usr/bin/ruby

require "open3"

# Run some simple smoke tests against the packaged app.

`gradle clean check jar`

def check(message, input, expected)
   cmd = "java -jar build/libs/robot19-0.1-SNAPSHOT.jar"
   Open3.popen2(cmd) do |stdin, stdout|
      input.each { |i| stdin.puts i }
      stdin.close
      actual = stdout.readlines.map{|a| a.strip}
      puts "#{message}: #{expected == actual ? "." : "got #{actual} expected #{expected}"}"
      @fail ||= (expected != actual)
   end
end

############# EXAMPLES #############

check "example 1",
  ["PLACE 0,0,NORTH", "MOVE", "REPORT"],
  ["0,1,NORTH"]

check "example 2",
  ["PLACE 0,0,NORTH", "LEFT", "REPORT"],
  ["0,0,WEST"]

check "example 3",
  ["PLACE 1,2,EAST", "MOVE", "MOVE", "LEFT", "MOVE", "REPORT"],
  ["3,3,NORTH"]

####################################

puts
exit @fail ? 1 : 0