require_relative 'group'

# Collection/group of blocks
class Structure
  # Collection of child group
  def initialize
    @groupList = Array.new
  end

  # assemble method should treat both single and group of blocks same.
  def assemble
    for group in @groupList
      group.assemble
    end
    print "Creating a structure from Group objects.\n"
  end

  # adds the group to the structure
  def add(group)
    @groupList.push(group)
  end

  # removes the group from the structure
  def remove(group)
    @groupList.delete(group)
  end
end