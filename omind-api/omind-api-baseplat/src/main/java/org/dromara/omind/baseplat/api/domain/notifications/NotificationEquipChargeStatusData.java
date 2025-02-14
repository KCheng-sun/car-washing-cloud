package org.dromara.omind.baseplat.api.domain.notifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dromara.omind.baseplat.api.domain.ChargeDetailData;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Schema(name = "NotificationEquipChargeStatusData", description = "推送充电状态")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEquipChargeStatusData implements Serializable {

    @Schema(name = "StartChargeSeq", description = "充电订单号", required = true)
    @JsonProperty(value = "StartChargeSeq")
    private String startChargeSeq;

    @Schema(name = "StartChargeSeqStat", description = "充电订单状态，1启动中，2充电中，3停止中，4已结束，5未知", required = true)
    @JsonProperty(value = "StartChargeSeqStat")
    private Short startChargeSeqStat;

    @Schema(name = "ConnectorID", description = "充电设备接口编码", required = true)
    @JsonProperty(value = "ConnectorID")
    private String connectorID;

    @Schema(name = "ConnectorStatus", description = "充电设备接口状态, 1空闲，2占用（未充电），3占用（充电中），4占用（预约锁定），255故障", required = true)
    @JsonProperty(value = "ConnectorStatus")
    private Integer connectorStatus;

    @Schema(name = "CurrentA", description = "A相电流,单位：A，默认：0 含直流(输出)", required = true)
    @JsonProperty(value = "CurrentA")
    private BigDecimal currentA;

    @Schema(name = "CurrentB", description = "B相电流,单位：A，默认：0", required = false)
    @JsonProperty(value = "CurrentB")
    private BigDecimal currentB;

    @Schema(name = "CurrentC", description = "C相电流,单位：A，默认：0", required = false)
    @JsonProperty(value = "CurrentC")
    private BigDecimal currentC;

    @Schema(name = "VoltageA", description = "A相电压,单位：V，默认：0含直流(输出)", required = true)
    @JsonProperty(value = "VoltageA")
    private BigDecimal voltageA;

    @Schema(name = "VoltageB", description = "B相电压,单位：V，默认：0", required = false)
    @JsonProperty(value = "VoltageB")
    private BigDecimal voltageB;

    @Schema(name = "VoltageC", description = "C相电压,单位：V，默认：0", required = false)
    @JsonProperty(value = "VoltageC")
    private BigDecimal voltageC;

    @Schema(name = "Soc", description = "电池剩余电量，默认0", required = true)
    @JsonProperty(value = "Soc")
    private BigDecimal soc;

    @Schema(name = "StartTime", description = "开始充电时间，格式“yyyy-MM-dd HH:mm:ss", required = true)
    @JsonProperty(value = "StartTime")
    private String startTime;

    @Schema(name = "EndTime", description = "本次采样时间，格式“yyyy-MM-dd HH:mm:ss”", required = true)
    @JsonProperty(value = "EndTime")
    private String endTime;

    @Schema(name = "TotalPower", description = "累计充电量，单位：度，小数点后2位", required = true)
    @JsonProperty(value = "TotalPower")
    private BigDecimal totalPower;

    @Schema(name = "ElecMoney", description = "累计电费，单位：元，小数点后2位", required = false)
    @JsonProperty(value = "ElecMoney")
    private BigDecimal elecMoney;

    @Schema(name = "SeviceMoney", description = "累计服务费，单位：元，小数点后2位", required = false)
    @JsonProperty(value = "SeviceMoney")
    private BigDecimal serviceMoney;

    @Schema(name = "TotalMoney", description = "累计总金额，单位：元，小数点后2位", required = false)
    @JsonProperty(value = "TotalMoney")
    private BigDecimal totalMoney;

    @Schema(name = "SumPeriod", description = "时段数N，范围 0-32", required = false)
    @JsonProperty(value = "SumPeriod")
    private Short sumPeriod;

    @Schema(name = "ChargeDetails", description = "充电明细信息，单时段充电明细信息", required = false)
    @JsonProperty(value = "ChargeDetails")
    List<ChargeDetailData> chargeDetails;

    @Schema(name = "Vin", description = "Vin信息", required = false)
    @JsonProperty(value = "Vin")
    private String vin;
}
