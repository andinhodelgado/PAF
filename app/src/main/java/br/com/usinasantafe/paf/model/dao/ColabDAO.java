package br.com.usinasantafe.paf.model.dao;

import java.util.List;

import br.com.usinasantafe.paf.model.bean.estaticas.ColabBean;


public class ColabDAO {

    public ColabDAO() {
    }

    public boolean hasElements(){
        ColabBean colabBean = new ColabBean();
        return colabBean.hasElements();
    }

    public boolean verColab(Long matricColab){
        List<ColabBean> colabList = colabMatricList(matricColab);
        boolean ret = colabList.size() > 0;
        colabList.clear();
        return ret;
    }

    public ColabBean getMatricColab(Long matricColab){
        List<ColabBean> colabList = colabMatricList(matricColab);
        ColabBean colabBean = colabList.get(0);
        colabList.clear();
        return colabBean;
    }

    public List<ColabBean> colabMatricList(Long matricColab){
        ColabBean colabBean = new ColabBean();
        return colabBean.get("matricColab", matricColab);
    }

}
