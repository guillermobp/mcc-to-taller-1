package biblioteca.domain;

import biblioteca.dao.DaoFactory;
import java.util.List;

/**
 * Representa un CD de la biblioteca.
 */
public class Cd extends Material {

    /**
     * @deprecated 
     */
    private Integer cid;

    public Cd() {
    }

    public Cd(String titulo, String editorial) {
        super(titulo, editorial);
    }

    public Cd(String titulo, String editorial, List<Copia> copias) {
        super(titulo, editorial, copias);
    }

    public Cd(Integer cid, String titulo, String editorial, List<Copia> copias) {
        super(titulo, editorial, copias);

        this.cid = cid;
    }

    /**
     * @deprecated 
     * @return 
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @deprecated 
     * @param cid 
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public void persist() {
        DaoFactory.getCdDao().create(this);
    }

    @Override
    public void delete() {
        DaoFactory.getCdDao().delete(this);
    }

    @Override
    public void load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
