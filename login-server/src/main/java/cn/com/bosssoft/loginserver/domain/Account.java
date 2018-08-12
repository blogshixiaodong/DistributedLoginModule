package cn.com.bosssoft.loginserver.domain;

/**
 * @author Shixiaodong
 * @date 2018/8/3 8:59
 */
public class Account {

    private Integer accountId;

    private String password;

    private Integer userId;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (getAccountId() != null ? !getAccountId().equals(account.getAccountId()) : account.getAccountId() != null)
            return false;
        return getPassword() != null ? getPassword().equals(account.getPassword()) : account.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getAccountId() != null ? getAccountId().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }
}
