package org.apache.spark.sql.catalyst.expressions;
public  class Sequence extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, scala.Product, scala.Serializable {
  static private  class DefaultStep {
    public   DefaultStep (scala.Function2<java.lang.Object, java.lang.Object, java.lang.Object> lteq, org.apache.spark.sql.types.DataType stepType, Object one)  { throw new RuntimeException(); }
    public  Object apply (Object start, Object stop)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode startGen, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode stopGen)  { throw new RuntimeException(); }
    private  Object negativeOne ()  { throw new RuntimeException(); }
  }
  static   interface SequenceImpl {
    public  org.apache.spark.sql.catalyst.expressions.Sequence.DefaultStep defaultStep ()  ;
    public  Object eval (Object start, Object stop, Object step)  ;
    public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String start, java.lang.String stop, java.lang.String step, java.lang.String arr, java.lang.String elemType)  ;
  }
  static private  class IntegralSequenceImpl<T extends java.lang.Object> implements org.apache.spark.sql.catalyst.expressions.Sequence.SequenceImpl {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   IntegralSequenceImpl (org.apache.spark.sql.types.IntegralType elemType, scala.reflect.ClassTag<T> evidence$1, scala.math.Integral<T> num)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Sequence.DefaultStep defaultStep ()  { throw new RuntimeException(); }
    public  java.lang.Object eval (Object input1, Object input2, Object input3)  { throw new RuntimeException(); }
    public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String start, java.lang.String stop, java.lang.String step, java.lang.String arr, java.lang.String elemType)  { throw new RuntimeException(); }
  }
  static private  class TemporalSequenceImpl<T extends java.lang.Object> implements org.apache.spark.sql.catalyst.expressions.Sequence.SequenceImpl {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   TemporalSequenceImpl (org.apache.spark.sql.types.IntegralType dt, long scale, scala.Function1<java.lang.Object, T> fromLong, java.util.TimeZone timeZone, scala.reflect.ClassTag<T> evidence$2, scala.math.Integral<T> num)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.catalyst.expressions.Sequence.IntegralSequenceImpl<T> backedSequenceImpl ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Sequence.DefaultStep defaultStep ()  { throw new RuntimeException(); }
    public  java.lang.Object eval (Object input1, Object input2, Object input3)  { throw new RuntimeException(); }
    public  java.lang.String genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String start, java.lang.String stop, java.lang.String step, java.lang.String arr, java.lang.String elemType)  { throw new RuntimeException(); }
    private  long microsPerMonth ()  { throw new RuntimeException(); }
  }
  static private <U extends java.lang.Object> int getSequenceLength (U start, U stop, U step, scala.math.Integral<U> num)  { throw new RuntimeException(); }
  static private  java.lang.String genSequenceLengthCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String start, java.lang.String stop, java.lang.String step, java.lang.String len)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin origin ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.trees.TreeNode<?>> containsChild ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  { throw new RuntimeException(); }
  static public  scala.Option<BaseType> find (scala.Function1<BaseType, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> map (scala.Function1<BaseType, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (scala.Function1<BaseType, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<BaseType> collectLeaves ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static protected <B extends java.lang.Object> java.lang.Object mapProductIterator (scala.Function1<java.lang.Object, B> f, scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  BaseType withNewChildren (scala.collection.Seq<BaseType> newChildren)  { throw new RuntimeException(); }
  static public  BaseType transform (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformDown (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformUp (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType mapChildren (scala.Function1<BaseType, BaseType> f)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  static public  BaseType makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
  static public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String verboseStringWithSuffix ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose, boolean addSuffix)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNode<?> apply (int number)  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.trees.TreeNode<?>> innerChildren ()  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix, boolean addSuffix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  boolean treeString$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static public  boolean generateTreeString$default$6 ()  { throw new RuntimeException(); }
  static public  boolean deterministic ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  static public  boolean childrenResolved ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression canonicalized ()  { throw new RuntimeException(); }
  static public  boolean semanticEquals (org.apache.spark.sql.catalyst.expressions.Expression other)  { throw new RuntimeException(); }
  static public  int semanticHash ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  static public final  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow eval$default$1 ()  { throw new RuntimeException(); }
  static public  boolean resolved ()  { throw new RuntimeException(); }
  static public  java.util.TimeZone timeZone ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression start ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression stop ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> stepOpt ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   Sequence (org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression stop, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> stepOpt, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  public   Sequence (org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression stop)  { throw new RuntimeException(); }
  public   Sequence (org.apache.spark.sql.catalyst.expressions.Expression start, org.apache.spark.sql.catalyst.expressions.Expression stop, org.apache.spark.sql.catalyst.expressions.Expression step)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean foldable ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.ArrayType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> coercibleChildren ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression castChildrenTo (org.apache.spark.sql.types.DataType widerType)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Sequence.SequenceImpl impl ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
