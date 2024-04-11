import tkinter as tk
from tkinter import ttk

class Produto:
    def __init__(self, nome, descricao, valor, disponivel_para_venda):
        self.nome = nome
        self.descricao = descricao
        self.valor = valor
        self.disponivel_para_venda = disponivel_para_venda

class Aplicacao:
    def __init__(self, root):
        self.root = root
        self.root.title("Cadastro e Listagem de Produtos")

        self.produtos = []

        self.frame_cadastro = ttk.Frame(root, padding="20")
        self.frame_cadastro.grid(row=0, column=0)

        ttk.Label(self.frame_cadastro, text="Nome do Produto:").grid(row=0, column=0, sticky="w")
        self.nome_produto_entry = ttk.Entry(self.frame_cadastro)
        self.nome_produto_entry.grid(row=0, column=1)

        ttk.Label(self.frame_cadastro, text="Descrição do Produto:").grid(row=1, column=0, sticky="w")
        self.descricao_produto_entry = ttk.Entry(self.frame_cadastro)
        self.descricao_produto_entry.grid(row=1, column=1)

        ttk.Label(self.frame_cadastro, text="Valor do Produto:").grid(row=2, column=0, sticky="w")
        self.valor_produto_entry = ttk.Entry(self.frame_cadastro)
        self.valor_produto_entry.grid(row=2, column=1)

        ttk.Label(self.frame_cadastro, text="Disponível para Venda:").grid(row=3, column=0, sticky="w")
        self.disponibilidade_produto_combo = ttk.Combobox(self.frame_cadastro, values=["Sim", "Não"])
        self.disponibilidade_produto_combo.grid(row=3, column=1)
        self.disponibilidade_produto_combo.current(0)

        ttk.Button(self.frame_cadastro, text="Cadastrar Produto", command=self.cadastrar_produto).grid(row=4, column=0, columnspan=2)

        self.frame_listagem = ttk.Frame(root, padding="20")
        self.frame_listagem.grid(row=1, column=0)

        ttk.Label(self.frame_listagem, text="Listagem de Produtos", font=('Helvetica', 14)).grid(row=0, column=0, columnspan=2)

        self.treeview = ttk.Treeview(self.frame_listagem, columns=("Nome", "Valor"))
        self.treeview.heading("Nome", text="Nome")
        self.treeview.heading("Valor", text="Valor")
        self.treeview.grid(row=1, column=0, columnspan=2)

        ttk.Button(self.frame_listagem, text="Cadastrar Novo Produto", command=self.mostrar_formulario_cadastro).grid(row=2, column=0, columnspan=2)

    def cadastrar_produto(self):
        nome = self.nome_produto_entry.get()
        descricao = self.descricao_produto_entry.get()
        valor = float(self.valor_produto_entry.get())
        disponibilidade = self.disponibilidade_produto_combo.get()

        disponibilidade_bool = True if disponibilidade == "Sim" else False

        produto = Produto(nome, descricao, valor, disponibilidade_bool)
        self.produtos.append(produto)

        self.listar_produtos()

    def listar_produtos(self):
        for item in self.treeview.get_children():
            self.treeview.delete(item)

        self.produtos.sort(key=lambda x: x.valor)

        for produto in self.produtos:
            self.treeview.insert("", "end", values=(produto.nome, produto.valor))

    def mostrar_formulario_cadastro(self):
        self.frame_cadastro.tkraise()

if __name__ == "__main__":
    root = tk.Tk()
    app = Aplicacao(root)
    app.listar_produtos()
    root.mainloop()
