require_relative 'block'
require_relative 'group'
require_relative 'structure'

block1 = Block.new(2,3);
block2 = Block.new(1,4);
block3 = Block.new(3,7);

# Initialize three structure
structure = Structure.new;
structure1 = Structure.new;
structure2 = Structure.new;

# Composes the groups
structure1.add(block1);
structure1.add(block2);

structure2.add(block3);

structure.add(structure1);
structure.add(structure2);

structure.assemble;