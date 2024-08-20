import entity.Projeto;
import entity.Engenheiro;
import entity.Operario;
import entity.Equipamento;
import entity.Material;
import dao.ProjetoDAO;
import dao.EngenheiroDAO;
import dao.OperarioDAO;
import dao.EquipamentoDAO;
import dao.MaterialDAO;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Connectors
        ProjetoDAO projetodao = new ProjetoDAO();
        EngenheiroDAO engenheirodao = new EngenheiroDAO();
        OperarioDAO operariodao = new OperarioDAO();
        EquipamentoDAO equipamentodao = new EquipamentoDAO();
        MaterialDAO materialdao = new MaterialDAO();
        Projeto projeto = new Projeto();
        Engenheiro engenheiro = new Engenheiro();
        Operario operario = new Operario();
        Equipamento equipamento = new Equipamento();
        Material material = new Material();

        //Inserir Projeto
        /*projeto.setnome("Implentação de objeto");
        projeto.setdataInicio(19082024);
        projeto.setdataTermino(20082024);
        projeto.setlocal("Codigo de objeto");
        projetodao.inserir(projeto);
        for (var p : projetodao.obterTodos()) {
            System.out.println(p);
        }

        //Atualizar Projeto
        projeto.setnome("Implentação de Objeto Associado");
        projeto.setdataInicio(16082024);
        projeto.setdataTermino(24082024);
        projeto.setlocal("Codigo do Portal");
        projeto.setid(2);
        projetodao.atualizar(projeto);
        for (var p : projetodao.obterTodos()) {
            System.out.println(p);
        };*/

        //Deletar Projeto
        /*projeto.setid(2);
        projetodao.deletar(projeto);
        for (var p : projetodao.obterTodos()) {
            System.out.println(p);
        };*/

        //Listar Projetos pelo ID
        for (var p: projetodao.obterPeloId()){
            System.out.println(p);

            //Inserir Engenheiro
        engenheiro.setnome("Jose");
        engenheiro.setespecialidade("Mecanica");
        engenheirodao.inserir(engenheiro);
        for (var e : engenheirodao.obterTodos()) {
            System.out.println(e);
        };

        //Atualizar Engenheiro
        engenheiro.setnome("Roberto");
        engenheiro.setespecialidade("Eletrica");
        engenheiro.setid(2);
        engenheirodao.atualizar(engenheiro);
        for (var e : engenheirodao.obterTodos()) {
            System.out.println(e);
        };

        //Deletar Engenheiro
        engenheiro.setid(3);
        engenheirodao.deletar(engenheiro);
        for (var e : engenheirodao.obterTodos()) {
            System.out.println(e);
        };

        //Listar Engenheiros
        for (var e: engenheirodao.obterPeloId()){
            System.out.println(e);
        }

        //Inserir Operario
        operario.setnome("Elizabeth");
        operario.setfuncao("Producao");
        operariodao.inserir(operario);
        for (var o : operariodao.obterTodos()) {
            System.out.println(o);
        };

        //Atualizar Operario
        operario.setnome("Ana");
        operario.setfuncao("Logistica");
        operario.setid(2);
        operariodao.atualizar(operario);
        for (var o : operariodao.obterTodos()) {
            System.out.println(o);
        };

        //Deletar Operario
        operario.setid(3);
        operariodao.deletar(operario);
        for (var o : operariodao.obterTodos()) {
            System.out.println(o);
        };

        //Listar Operarios


        //Inserir Equipamento
        equipamento.setnome("Chave de Torque N20");
        equipamento.settipo("Chave de Torque");
        equipamentodao.inserir(equipamento);
        for (var eq : equipamentodao.obterTodos()) {
            System.out.println(eq);
        };

        //Atualizar Equipamento
        equipamento.setnome("Chave de Torque N10");
        equipamento.settipo("Chave de Torque");
        equipamento.setid(2);
        equipamentodao.atualizar(equipamento);
        for (var eq : equipamentodao.obterTodos()) {
            System.out.println(eq);
        };

        //Deletar Equipamento
        equipamento.setid(3);
        equipamentodao.deletar(equipamento);
        for (var eq : equipamentodao.obterTodos()) {
            System.out.println(eq);
        };

        //Listar Equipamentos


        //Inserir Material
        material.setnome("Parafuso hexagonal");
        material.setquantidade(40);
        materialdao.inserir(material);
        for (var m : engenheirodao.obterTodos()) {
            System.out.println(m);
        };

        //Atualizar Material
        material.setnome("Parafuso quadrado");
        material.setquantidade(10);
        material.setid(2);
        materialdao.atualizar(material);
        for (var m : materialdao.obterTodos()) {
            System.out.println(m);
        };

        //Deletar Material
        material.setid(3);
        materialdao.deletar(material);
        for (var m : materialdao.obterTodos()) {
            System.out.println(m);
        };

            //Listar Materiais*/

        }
    }
}