// https://www.youtube.com/watch?v=igedHOpSqu4

import java.util.ArrayList;

public class BlockChainProgram {
	public static void main(String[] args) {
		//demonstrate a hash function
		/*String statement_1 = "My world is sucks!";
		int hashvalue = statement_1.hashCode();

		System.out.println("Statement = " + statement_1 + " hash value = " + hashvalue);

		// let's hash an array
		String [] list_1 = {"alex", "becky", "cyril"};
		String [] list_2 = {"alex", "becky", "Cyril"};

		int hash_1 = Arrays.hashCode(list_1);
		int hash_2 = Arrays.hashCode(list_2);

		System.out.println("hash_1 = " + hash_1 + " hash_2 = " + hash_2);*/

		// demonstrate a series of blocks in a chain
		ArrayList<Block> blockChain = new ArrayList<Block>();

		String[] initialValues = {"Shad has $700", "Miguel has $550"};
		// 0 is any number. A good number to start
		Block firstBlock = new Block(initialValues, 0);
		blockChain.add(firstBlock);
		System.out.println("First block is " + firstBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());

		// block two
		String[] shadGivesItAway = {"Shad gives Tim $40", "Shad gives Tany $60", "Shad gives Terry $100"};
		Block secondBlock = new Block(shadGivesItAway, firstBlock.getBlockHash());
		blockChain.add(secondBlock);
		System.out.println("Second block is " + secondBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());

		// block three
                String[] shadGetsSomeBack = {"Tim gives Shad $10", "Terry gives $50 to Shad"};
                Block thirdBlock = new Block(shadGetsSomeBack, secondBlock.getBlockHash());
                blockChain.add(thirdBlock);
                System.out.println("Third block is " + thirdBlock.toString());
                System.out.println("The block chain is " + blockChain.toString());

	}
}
