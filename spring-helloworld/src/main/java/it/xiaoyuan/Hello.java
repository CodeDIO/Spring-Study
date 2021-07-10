package it.xiaoyuan;

/**
 * @author xiaoyuan.zhang
 * @date 2021/7/10 - 15:49
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
