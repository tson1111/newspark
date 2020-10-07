package org.apache.spark.mllib.pmml.export;
  interface PMMLModelExport {
  public  org.dmg.pmml.PMML getPmml ()  ;
  /**
   * Holder of the exported model in PMML format
   * @return (undocumented)
   */
  public  org.dmg.pmml.PMML pmml ()  ;
}
