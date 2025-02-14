package io.github.linpeilie;

import org.dromara.demo.domain.TestDemo;
import org.dromara.demo.domain.TestTree;
import org.dromara.demo.domain.bo.TestDemoBo;
import org.dromara.demo.domain.bo.TestDemoBoToTestDemoMapper;
import org.dromara.demo.domain.bo.TestTreeBo;
import org.dromara.demo.domain.bo.TestTreeBoToTestTreeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private TestTreeBoToTestTreeMapper testTreeBoToTestTreeMapper;

  @Autowired
  @Lazy
  private TestDemoBoToTestDemoMapper testDemoBoToTestDemoMapper;

  public TestTree org_dromara_demo_domain_bo_TestTreeBoToTestTree(TestTreeBo param) {
    return testTreeBoToTestTreeMapper.convert(param);}

  public TestDemo org_dromara_demo_domain_bo_TestDemoBoToTestDemo(TestDemoBo param) {
    return testDemoBoToTestDemoMapper.convert(param);}
}
