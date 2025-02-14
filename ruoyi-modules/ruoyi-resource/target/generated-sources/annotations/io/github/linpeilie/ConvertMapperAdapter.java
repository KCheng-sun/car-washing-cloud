package io.github.linpeilie;

import org.dromara.resource.domain.SysOss;
import org.dromara.resource.domain.SysOssConfig;
import org.dromara.resource.domain.SysOssConfigToSysOssConfigVoMapper;
import org.dromara.resource.domain.SysOssToSysOssVoMapper;
import org.dromara.resource.domain.bo.SysOssBo;
import org.dromara.resource.domain.bo.SysOssBoToSysOssMapper;
import org.dromara.resource.domain.bo.SysOssConfigBo;
import org.dromara.resource.domain.bo.SysOssConfigBoToSysOssConfigMapper;
import org.dromara.resource.domain.vo.SysOssConfigVo;
import org.dromara.resource.domain.vo.SysOssConfigVoToSysOssConfigMapper;
import org.dromara.resource.domain.vo.SysOssVo;
import org.dromara.resource.domain.vo.SysOssVoToSysOssMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private SysOssConfigToSysOssConfigVoMapper sysOssConfigToSysOssConfigVoMapper;

  @Autowired
  @Lazy
  private SysOssBoToSysOssMapper sysOssBoToSysOssMapper;

  @Autowired
  @Lazy
  private SysOssConfigVoToSysOssConfigMapper sysOssConfigVoToSysOssConfigMapper;

  @Autowired
  @Lazy
  private SysOssVoToSysOssMapper sysOssVoToSysOssMapper;

  @Autowired
  @Lazy
  private SysOssConfigBoToSysOssConfigMapper sysOssConfigBoToSysOssConfigMapper;

  @Autowired
  @Lazy
  private SysOssToSysOssVoMapper sysOssToSysOssVoMapper;

  public SysOssConfigVo org_dromara_resource_domain_SysOssConfigToSysOssConfigVo(SysOssConfig param) {
    return sysOssConfigToSysOssConfigVoMapper.convert(param);}

  public SysOss org_dromara_resource_domain_bo_SysOssBoToSysOss(SysOssBo param) {
    return sysOssBoToSysOssMapper.convert(param);}

  public SysOssConfig org_dromara_resource_domain_vo_SysOssConfigVoToSysOssConfig(SysOssConfigVo param) {
    return sysOssConfigVoToSysOssConfigMapper.convert(param);}

  public SysOss org_dromara_resource_domain_vo_SysOssVoToSysOss(SysOssVo param) {
    return sysOssVoToSysOssMapper.convert(param);}

  public SysOssConfig org_dromara_resource_domain_bo_SysOssConfigBoToSysOssConfig(SysOssConfigBo param) {
    return sysOssConfigBoToSysOssConfigMapper.convert(param);}

  public SysOssVo org_dromara_resource_domain_SysOssToSysOssVo(SysOss param) {
    return sysOssToSysOssVoMapper.convert(param);}
}
