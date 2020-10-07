package org.apache.spark.ml.optim.loss;
/**
 * This class computes the gradient and loss of a differentiable loss function by mapping a
 * {@link DifferentiableLossAggregator} over an {@link RDD}. The loss function is the
 * sum of the loss computed on a single instance across all points in the RDD. Therefore, the actual
 * analytical form of the loss function is specified by the aggregator, which computes each points
 * contribution to the overall loss.
 * <p>
 * A differentiable regularization component can also be added by providing a
 * {@link DifferentiableRegularization} loss function.
 * <p>
 * param:  instances RDD containing the data to compute the loss function over.
 * param:  getAggregator A function which gets a new loss aggregator in every tree aggregate step.
 * param:  regularization An option representing the regularization loss function to apply to the
 *                       coefficients.
 * param:  aggregationDepth The aggregation depth of the tree aggregation step.
 * @param <Agg>  Specialization of {@link DifferentiableLossAggregator}, representing the concrete type
 *             of the aggregator.
 */
  class RDDLossFunction<T extends java.lang.Object, Agg extends org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<T, Agg>> implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<T1, A> andThen (scala.Function1<R, A> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $plus$colon$plus (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpAdd$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$plus (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpAdd$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $times$colon$times (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMulScalar$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$times (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMulScalar$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$eq$eq (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpEq$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$bang$eq (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpNe$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, That extends java.lang.Object> That unary_$minus (breeze.generic.UFunc.UImpl<breeze.linalg.operators.OpNeg$, TT, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $minus$colon$minus (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpSub$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$minus (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpSub$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $minus (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpSub$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $percent$colon$percent (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMod$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$percent (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMod$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $percent (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMod$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $div$colon$div (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpDiv$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$div (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpDiv$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $div (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpDiv$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $up$colon$up (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpPow$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$up (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpPow$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, BB extends java.lang.Object, That extends java.lang.Object> That dot (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMulInner$, TT, BB, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, That extends java.lang.Object> That unary_$bang (breeze.generic.UFunc.UImpl<breeze.linalg.operators.OpNot$, TT, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $amp$colon$amp (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpAnd$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$amp (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpAnd$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $bar$colon$bar (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpOr$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$bar (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpOr$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $up$up$colon$up$up (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpXor$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$up$up (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpXor$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $amp (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpAnd$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $bar (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpOr$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $up$up (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpXor$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $times (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpMulMatrix$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, That extends java.lang.Object> That t (breeze.linalg.support.CanTranspose<TT, That> op)  { throw new RuntimeException(); }
  static public <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $bslash (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpSolveMatrixBy$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, That extends java.lang.Object, Slice1 extends java.lang.Object, Slice2 extends java.lang.Object, Result extends java.lang.Object> Result t (Slice1 a, Slice2 b, breeze.linalg.support.CanTranspose<TT, That> op, breeze.linalg.support.CanSlice2<That, Slice1, Slice2, Result> canSlice)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, That extends java.lang.Object, Slice1 extends java.lang.Object, Result extends java.lang.Object> Result t (Slice1 a, breeze.linalg.support.CanTranspose<TT, That> op, breeze.linalg.support.CanSlice<That, Slice1, Result> canSlice)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, That extends java.lang.Object> That $plus (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpAdd$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpSet$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$plus$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpAdd$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$times$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpMulScalar$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $plus$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpAdd$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $times$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpMulScalar$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$minus$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpSub$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$percent$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpMod$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $percent$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpMod$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $minus$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpSub$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$div$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpDiv$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$up$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpPow$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $div$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpDiv$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $less$colon$less (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpLT$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$less (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpLT$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $less$colon$eq (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpLTE$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$less$eq (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpLTE$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $greater$colon$greater (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpGT$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$greater (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpGT$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $greater$colon$eq (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpGTE$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object, That extends java.lang.Object> That $colon$greater$eq (B b, breeze.generic.UFunc.UImpl2<breeze.linalg.operators.OpGTE$, TT, B, That> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$amp$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpAnd$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$bar$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpOr$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $colon$up$up$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpXor$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $amp$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpAnd$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $bar$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpOr$, TT, B> op)  { throw new RuntimeException(); }
  static public final <TT extends java.lang.Object, B extends java.lang.Object> This $up$up$eq (B b, breeze.generic.UFunc.InPlaceImpl2<breeze.linalg.operators.OpXor$, TT, B> op)  { throw new RuntimeException(); }
  static public  T gradientAt (T x)  { throw new RuntimeException(); }
  static public  double valueAt (T x)  { throw new RuntimeException(); }
  static public final  double apply (T x)  { throw new RuntimeException(); }
  static public  breeze.optimize.DiffFunction<T> repr ()  { throw new RuntimeException(); }
  static public  breeze.optimize.DiffFunction<T> cached (breeze.linalg.support.CanCopy<T> copy)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> breeze.optimize.DiffFunction<U> throughLens (breeze.util.Isomorphism<T, U> l)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.ml), org.apache.spark.ml.optim), org.apache.spark.ml.optim.aggregator), org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator), List(TypeTree().setOriginal(Ident(TypeName("T"))), TypeTree().setOriginal(Ident(TypeName("Agg"))))))))
  public   RDDLossFunction (org.apache.spark.rdd.RDD<T> instances, scala.Function1<org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector>, Agg> getAggregator, scala.Option<org.apache.spark.ml.optim.loss.DifferentiableRegularization<org.apache.spark.ml.linalg.Vector>> regularization, int aggregationDepth, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<Agg> evidence$2)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> coefficients)  { throw new RuntimeException(); }
}
