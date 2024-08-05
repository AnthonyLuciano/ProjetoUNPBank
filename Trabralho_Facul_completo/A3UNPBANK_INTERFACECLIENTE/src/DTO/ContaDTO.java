
package DTO;

import java.util.Random;

/**
 *
 * @author tosca
 */
public class ContaDTO {
    
   
    private String cpf_cliente, saldo_cliente, status_cliente, senha_conta;
    private String id_conta;

 
    /**
     * @return the cpf_cliente
     */
    public String getCpf_cliente() {
        return cpf_cliente;
    }

    /**
     * @param cpf_cliente the cpf_cliente to set
     */
    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    /**
     * @return the saldo_cliente
     */
    public String getSaldo_cliente() {
        return saldo_cliente;
    }

    /**
     * @param saldo_cliente the saldo_cliente to set
     */
    public void setSaldo_cliente(String saldo_cliente) {
        this.saldo_cliente = saldo_cliente;
    }

    /**
     * @return the status_cliente
     */
    public String getStatus_cliente() {
        return status_cliente;
    }

    /**
     * @param status_cliente the status_cliente to set
     */
    public void setStatus_cliente(String status_cliente) {
        this.status_cliente = status_cliente;
    }

    /**
     * @return the id_conta
     */
    public String getId_conta() {
        return id_conta;
    }

    /**
     * @param id_conta the id_conta to set
     */
    public void setId_conta(String id_conta) {
        this.id_conta = id_conta;
    }

    /**
     * @return the senha_conta
     */
    public String getSenha_conta() {
        return senha_conta;
    }

    /**
     * @param senha_conta the senha_conta to set
     */
    public void setSenha_conta(String senha_conta) {
        this.senha_conta = senha_conta;
    }
    
}
