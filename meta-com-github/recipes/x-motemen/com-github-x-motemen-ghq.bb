HOMEPAGE = "https://github.com/x-motemen/ghq"
PV = "1.1.5"
PR = "r0"
PROVIDES += "ghq"

inherit bb_fetcher
addtask do_unpack before do_build

SRCNAME = "ghq_linux_amd64"

SRC_URI = "https://github.com/x-motemen/ghq/releases/download/v${PV}/${SRCNAME}.zip;name=amd64"
SRC_URI[amd64.md5sum] = "82ea0fb6af384ee5f613bfe9803e8a95"
SRC_URI[amd64.sha256sum] = "417b7a6f71a80cff32e9f61a6578f7ec3b58e0470863ad719760c3fada938e70"

inherit install_bin_go
do_build(){
    install_bin_go_with_name "${WORKDIR}/${SRCNAME}/ghq" 'ghq'
}
