package x01_oop.four_features.encapsulation;

import x01_oop.four_features.IdGenerator;

import java.math.BigDecimal;

/**
 * 封装：
 *      权限控制关键字控制属性方法访问权限，类内部的处理逻辑由类方法来cover
 *
 *      像createTime这种不会修改的数据，对外不提供修改方法
 *
 * @author XiaoYi
 * Created on 2021/12/16.
 */
public class Wallet {

    private String id;

    private long createTime;

    private BigDecimal balance;

    private long balanceLastModifiedTime;

    public String getId() {
        return id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getBalanceLastModifiedTime() {
        return balanceLastModifiedTime;
    }

    public Wallet() {
        this.id = IdGenerator.getInstance().generate();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    // 修改时间不对外提供，而由增加/减少逻辑统一完成

    /**
     * 增加金额
     *
     * @param increasedAmount
     */
    public void increaseBalance(BigDecimal increasedAmount) {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("InvalidAmountException");
        }
        this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    /**
     * 减少金额
     *
     * @param decreasedAmount
     */
    public void decreaseBalance(BigDecimal decreasedAmount) {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0){
            throw new RuntimeException("InvalidAmountException");
        }
        if (decreasedAmount.compareTo(this.balance) > 0){
            throw new RuntimeException("InsufficientAmountException");
        }
        this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }


}
