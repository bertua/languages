ls / ls -lha
-a hidden files
-t time order
-l long details file
-h human format
pwd                                  // print caminho atual
dir                                  // mostra diretorio
cd ..                                // mudar diretorio (. pasta atual, .. pasta anterior)
mkdir                                // cria pasta
touch (ou) > arquivo.txt             // cria arquivo
cat arquivo.txt                      // mostra o que esta no arquivo
cat arquivo.txt > hello.txt          // reescreve tudo o que esta no hello.txt pelo arquivo.txt
cat arquivo.txt >> hello.txt         // adiciona o que esta no arquivo.txt em hello.txt sem reescrever
cat volcanoes.txt | wc | cat > count.txt // pipe, redirects standard output of a command to another command (wc word count)
echo "conteudo" > arquivo.txt        // adiciona conteudo no arquivo (reescreve)
echo "conteudo" >> arquivo.txt       // adiciona conteudo no arquivo (não reescreve)
cp arquivo.txt arquivo.bak           // cria copia do arquivo
cp arquivo.txt directory/            // cria copia do arquivo na pasta
mv arquivo.txt directory/            // move arquivo
mv arquivo.txt arquivoRename.txt     // renomeia arquivo
rm arquivo.txt                       // deleta arquivo
rm -r directory/                     // deleta diretorio
sort arquivo.txt                     // arruma alfabeticamente (cat glaciers.txt | sort > sorted-glaciers.txt) (sort lakes.txt > sorted-lakes.txt)
uniq arquivo.txt                     // print, não repete os dados iguais (sort deserts.txt | uniq > uniq-deserts.txt)     
grep Mount mountains.txt             // print somente aqueles com nome da palavra descrita
grep -i Mount mountains.txt          // insensivel ao tamanho das letras
grep -R Island /home/ccuser/workspace/geography  // (/home/ccuser/workspace/geography/islands.txt:Turks and Caicos Islands)
grep -Rl Island /home/ccuser/workspace/geography  // (/home/ccuser/workspace/geography/islands.txt)
sed 's/snow/rain/' forests.txt       // "(s) substitua/(snow) este string/(rain) por este/" no arquivo forests.txt (apenas ocorre uma vez), a modificação ocorre só no output não no arquivo original
sed 's/snow/rain/g' forests.txt      // g de global substitui todas as palavras, não apenas uma vez
sed -i 's/snow/rain/g' forests.txt   // irá reescrever no arquivo original



