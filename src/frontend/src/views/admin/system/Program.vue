<template>
  <v-app>
    <h1>프로그램 등록</h1>
    <v-data-table
        :headers="headers"
        :items="desserts"
        :items-per-page="5"
        class="elevation-1">
    </v-data-table>
  </v-app>
</template>

<script>

export default {
  name: 'Component',
  data () {
    return {
      headers: [
        { text: '프로그램 코드', align: 'start', sortable: true, value: 'progCd' },
        { text: '이름', sortable: true, value: 'name' },
        { text: 'URL', sortable: true, value: 'url' },
        { text: '저장 경로', sortable: true, value: 'progPath' },
        { text: '비고', sortable: true, value: 'etc' },
      ],
      desserts: [
        {progCd: "Menu", name: "program", url: "/system/program", progPath: "/system/Program.vue", etc: "프로그램 관리"},
        {progCd: "User", name: "user", url: "/system/user", progPath: "/system/User.vue", etc: "사용자 관리"},
        {progCd: "Code", name: "code", url: "/system/code", progPath: "/system/Code.vue", etc: "공통코드 관리"},
      ]
    }
  },
  components: {
  }
}
</script>
