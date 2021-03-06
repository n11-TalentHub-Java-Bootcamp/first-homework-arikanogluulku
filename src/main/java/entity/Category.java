package entity;

import javax.persistence.*;

@Entity
@Table(name="CATEGORY")
public class Category {

    @SequenceGenerator(name = "generator" , sequenceName = "CATEGORY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name="ID" , nullable = false)
    private  Long id;

    @Column(name="NAME", nullable = false , length = 50 )
    private String name;

    @Column(name="BREAKDOWN")
    private Long breakdown;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_TOP_CATEGORY")
    private Category topCategory;


    public Long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Long breakdown) {
        this.breakdown = breakdown;
    }

    public Category getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(Category topCategory) {
        this.topCategory = topCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breakdown=" + breakdown +
                ", topCategory=" + topCategory +
                '}';
    }
}
