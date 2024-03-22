// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
//Edited by Siphosethu Magubane 
//February 2024

public class BinaryTreeNode<dataType>
{
   dataType data;
   dataType statement;
   dataType score;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   int height;
   
   public BinaryTreeNode ( dataType d, dataType Statement, dataType Score , BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      statement = Statement;
      score = Score;
      left = l;
      right = r;
      height = 0;
      
   }
   
   dataType getData (){return this.data;}
   
   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
}
