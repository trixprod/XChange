package org.knowm.xchange.binance.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import lombok.Data;

public final class AssetDividendList extends SapiResponse<List<AssetDividendList.AssetDividend>> {

  private final AssetDividend[] rows;

  private final Long total;

  public AssetDividendList(
      @JsonProperty("rows") AssetDividend[] rows, @JsonProperty("total") Long total) {
    this.rows = rows;
    this.total = total;
  }

  @Override
  public List<AssetDividend> getData() {
    return Arrays.asList(rows);
  }

  public Long getTotal() {
    return total;
  }

  @Override
  public String toString() {
    return "AssetDividendList [rows=" + Arrays.toString(rows) + "]";
  }

  @Data
  public static final class AssetDividend {
    private BigDecimal amount;
    private String asset;
    private Long divTime;
    private String enInfo;
    private Long tranId;

    public BigDecimal getAmount() {
      return amount;
    }

    public String getAsset() {
      return asset;
    }

    public Long getDivTime() {
      return divTime;
    }

    public String getEnInfo() {
      return enInfo;
    }

    public Long getTranId() {
      return tranId;
    }
  }
}
